package io.cucumber.utilities;

import org.apache.logging.log4j.util.Constants;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.monte.media.VideoFormatKeys.*;

public class ScreenRecorderUtil
{

    public static void startRecording() throws IOException, AWTException
    {
        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        ObjectUtil.screenRecorder = new ScreenRecorder(gc,
                gc.getBounds(),
                new Format(FormatKeys.MediaTypeKey, MediaType.FILE, FormatKeys.MimeTypeKey, FormatKeys.MIME_AVI),
                new Format(FormatKeys.MediaTypeKey, MediaType.VIDEO, FormatKeys.EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, 24, FormatKeys.FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f,
                        FormatKeys.KeyFrameIntervalKey, 15 * 60),
                new Format(FormatKeys.MediaTypeKey, MediaType.VIDEO, FormatKeys.EncodingKey, "black", FormatKeys.FrameRateKey, Rational.valueOf(30)),
                null,
                new File(Constant.SCREENRECORDING_PATH));
        ObjectUtil.screenRecorder.start();
    }

    public static void stopRecording() throws IOException
    {
        ObjectUtil.screenRecorder.stop();
    }

}