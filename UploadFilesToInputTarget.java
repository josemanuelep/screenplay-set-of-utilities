package co.com.choucair.certification.linkedin.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpLoadFile implements Interaction {

    private static final Logger LOGGER = Logger.getLogger(UpLoadFile.class.getName());

    private Target obj;
    private List<Path> paths = new ArrayList<>();
    private String sDirectorio;

    public UpLoadFile(Target obj, String sDirectorio) {
        this.obj = obj;
        this.sDirectorio = sDirectorio;
    }

    public static UpLoadFile of(String path, Target obj) {
        return new UpLoadFile(obj, path);
    }

    private void GetFilePaths() throws IOException {
        sDirectorio = ".\\src\\test\\resources\\testFiles\\";
        File f = new File(sDirectorio);
        if (f.exists()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                try {
                    paths.add(Paths.get(files[i].getCanonicalPath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            GetFilePaths();
            for (Path pt : this.paths) {
                actor.attemptsTo(Upload.theFile(pt).to(obj));
            }

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Element not found in class UpLoadFile");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "It is not possible select UpLoadFile", e);
        }

    }
}
