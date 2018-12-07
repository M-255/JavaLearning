package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/28 18:26
 * @description
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 马战川
 * @version 1.0
 * @className GetChannel
 * @date 2018/11/28 18:26
 * @description TODO
 */
public class GetChannel {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream(new File("")).getChannel();
        fc.write(ByteBuffer.wrap("www".getBytes()));
        fc.close();
        fc = new FileInputStream(new File("")).getChannel();
        ByteBuffer bf = ByteBuffer.allocate(BSIZE);
        fc.read(bf);
    }

}
