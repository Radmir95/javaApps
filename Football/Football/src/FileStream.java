import java.io.*;
import java.util.ArrayList;


public class FileStream {
    private File f;
    public FileStream(File file) {
        this.f = file;
    }


    public void setF(File f) {
        this.f = f;
    }


    public ArrayList<String> readFromFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);

                //lines.add("\n");
            }
            reader.close();
            return lines;
        } catch (IOException e) {
            System.out.println("Ошибочка вышла");
        };
        return null;
    }

    public void write(String fileName, ArrayList baza) {
        File file = new File(fileName);

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                String s;
                for (int i=0;i<baza.size();i++)
                out.print(baza.get(i));
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


        public void reWrite(String fileName,ArrayList baza) {

                try {
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileName)), true);

                    for (int i = 0; i < baza.size(); i++){
                        out.println(baza.get(i));
                    }

                    out.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

    }


}


