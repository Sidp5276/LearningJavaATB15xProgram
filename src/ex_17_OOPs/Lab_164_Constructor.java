package ex_17_OOPs;

public class Lab_164_Constructor {

        public static void main(String[] args) {
            Lab_162_Animal dog = new Lab_162_Animal();
            MySQL a = new MySQL();
            ReadExcelFile e = new ReadExcelFile();

        }

    }

    class MySQL {
        MySQL() {
            System.out.println("MySQL Connected!");
        }
    }

    class ReadExcelFile {
        ReadExcelFile() {
            System.out.println("ExcelFile is Loaded!");
    }
    }
