package dev.jlibra.move;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Move {

    public static byte[] peerToPeerTransferAsBytes() {
        try {
            InputStream jsonBinary = Move.class.getResourceAsStream("/move/peer_to_peer_transfer.bin.json");
            String json = readJson(jsonBinary, "UTF-8");
            String[] bytesAsString = json.substring(json.indexOf('[') + 1, json.indexOf(']')).split(",");
            byte[] bytes = new byte[bytesAsString.length];
            for (int idx = 0; idx < bytesAsString.length; idx++) {
                bytes[idx] = (byte)Integer.parseInt(bytesAsString[idx]);
            }
            return bytes;
        } catch (IOException ex) {
            throw new RuntimeException("Error reading p2p transaction script.", ex);
        }
    }

    private static String readJson(InputStream inputStream, String encoding) throws IOException {
        return new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))
                .lines()
                .collect(Collectors.joining());
    }

}