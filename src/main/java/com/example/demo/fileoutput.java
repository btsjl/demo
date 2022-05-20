package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutput extends person{
    private final String filename;
    final String space=" ", n="\n";
    public fileoutput(String user, String password,String filename) {
        super(user, password);
        this.filename=filename;
    }
    public void outputfile() throws IOException {
        File file=new File(filename);
        if (super.getPasswordb()!=null&&super.getUser()!=null) {
            if (!file.exists()) {
                FileOutputStream fileout = new FileOutputStream(file);
                fileout.write(super.getUserb());
                fileout.write(space.getBytes());
                fileout.write(super.getPasswordb());
                fileout.write(n.getBytes());
                fileout.close();
            } else {
                FileOutputStream fileout = new FileOutputStream(file, true);
                fileout.write(super.getUserb());
                fileout.write(space.getBytes());
                fileout.write(super.getPasswordb());
                fileout.write(n.getBytes());
                fileout.close();
            }
        }

    }

}

