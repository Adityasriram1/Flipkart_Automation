package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
    public static void CaptureScreenshot(WebDriver driver, String testName) {
        if (driver == null) {
            System.err.println("ScreenshotUtils: driver is null, cannot take screenshot");
            return;
        }
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            // Build screenshots directory under current working directory (project root)
            String screenshotsDir = System.getProperty("user.dir") + File.separator + "Screenshots";
            File destDir = new File(screenshotsDir);
            if (!destDir.exists()) {
                boolean created = destDir.mkdirs();
                if (!created) {
                    System.err.println("ScreenshotUtils: failed to create directory: " + destDir.getAbsolutePath());
                }
            }

            // Create timestamped filename
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
            String safeTestName = (testName == null || testName.trim().isEmpty()) ? "screenshot" : testName.replaceAll("[^a-zA-Z0-9-_]", "_");
            String filename = safeTestName + "_" + timestamp + ".png";

            Path destPath = new File(destDir, filename).toPath();

            // Copy the file (preferred over renameTo for cross-filesystem reliability)
            Files.copy(srcFile.toPath(), destPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Screenshot saved to: " + destPath.toAbsolutePath());
        } catch (ClassCastException cce) {
            System.err.println("ScreenshotUtils: WebDriver does not support taking screenshots: " + cce.getMessage());
        } catch (IOException ioe) {
            System.err.println("ScreenshotUtils: IO error while saving screenshot: " + ioe.getMessage());
            ioe.printStackTrace();
        } catch (Exception e) {
            System.err.println("ScreenshotUtils: unexpected error while taking screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }

}