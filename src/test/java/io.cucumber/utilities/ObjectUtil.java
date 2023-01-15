package io.cucumber.utilities;


import org.monte.screenrecorder.ScreenRecorder;
import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectUtil
{
    public static int stepNumber=1;


    //MONTE DEPENDENCY'DEN GELEN CLASSTIR, JDK'DA YOKTUR
    public static ScreenRecorder screenRecorder;


    //takeScreenShot() icerisinde kullanilir.
    //Alinan her ss'yi bunyesinde biriktirir
    //Test bitmeden PDF'e yazar
    public static Map<byte[],String> ekranGoruntusu_aciklamasi=new LinkedHashMap<>();





}
