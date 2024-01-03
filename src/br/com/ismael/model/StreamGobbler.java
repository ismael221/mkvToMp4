/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ismael.model;

/**
 *
 * @author ismael221
 */
public class StreamGobbler implements Runnable {
      private final java.io.InputStream inputStream;

    public StreamGobbler(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                // Exibe a saída do processo no console
                //JOptionPane.showMessageDialog(null,line);
                  System.out.println(line);
            }
        } catch (java.io.IOException e) {
             e.printStackTrace();
        }
    }
}

