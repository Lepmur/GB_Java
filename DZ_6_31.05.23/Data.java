import java.util.ArrayList;
import java.util.List;

public class Data {
    public static Notebook msiLeopard = new Notebook(1000, 85500, "MSI", "Leopard-gp72-7rdx",
            "QE2485GKR325", 17.6, "Intel Core i7-7700HQ", 2600,
            "Nvidia GeForce GTX 1050Ti", 6, 32, true, 2000,
            "Windows11 Pro", true, true, false);
    public static  Notebook msiKatana = new Notebook(1001, 95000, "MSI", "Katana-ge75-9se",
            "QE2485GKR765", 17.3, "Intel Core i7-10750H", 2800,
            "Nvidia GeForce RTX 2060", 8, 16, true, 1000,
            "Windows 11 Home", true, true, false);
    public static Notebook hpPavilion = new Notebook(1002, 36000, "HP", "Pavilion-15-cs3071nr",
            "ZGHE2745", 15.6, "Intel Core i5-5600M", 2200,
            "Nvidia GeForce MX450", 2, 4, false, 500,
            "Windows 10 Home", true, true, false);
    public static Notebook hpProBook = new Notebook(1003, 55000, "HP", "ProBook 450 G8",
            "ABC123XYZ", 15.6, "Intel Core i5-1120G5", 3200,
            "Intel Iris Xe Graphics", 4, 8, true, 256,
            "Windows 11 Enterprise", true, true, false);
    public static Notebook hpEliteBook = new Notebook(1004, 75000, "HP", "EliteBook 840 G8",
            "ABC123RTY", 17.3, "Intel Core i7-1165G7", 3600,
            "Intel Iris Xe Graphics", 4, 16, true, 500,
            "Linux Debian", true, true, false);
    public static Notebook hpOmen = new Notebook(1005, 120000, "HP", "OMEN 15",
            "ABC123KLH", 15.6, "Intel Core i7-11800H", 3200,
            "Nvidia GeForce RTX 3070", 12, 32, true, 1000,
            "Windows 11 Home", true, true, false);
    public static Notebook lenovoThinkPad = new Notebook(1006, 58000, "Lenovo", "ThinkPad X1 Carbon",
            "ln743hers", 14.0, "Intel Core i7-1165G7", 2800,
            "Intel Iris Xe Graphics", 4, 16, true, 500,
            "Linux Debian", true, true, false);
    public static Notebook lenovoLegion = new Notebook(1007, 95000, "Lenovo", "Legion 5",
            "XYZ987ABC", 15.6, "AMD Ryzen 7 5800H", 3200,
            "Nvidia GeForce RTX 3060", 8, 32, true, 1000,
            "Windows 11 Home", true, true, false);
    public static Notebook appleMacBookAir = new Notebook(1008, 99900, "Apple", "MacBook Air",
            "apmcbkar122316", 13.3, "Apple M1", 3200,
            "Apple M1 GPU", 4, 16, true, 500,
            "macOS Big Sur", true, true, false);
    public static Notebook appleMacBookPro = new Notebook(1009, 149900, "Apple", "MacBook Pro 16",
            "XYZ789ABC", 16, "Intel Core i9", 3200,
            "AMD Radeon Pro 5600M", 8, 32, true, 2000,
            "macOS Monterey", true, true, false);

    public static List<Notebook> notebookList = new ArrayList<>();
        static {notebookList.add(msiLeopard); notebookList.add(msiKatana); notebookList.add(hpPavilion);
            notebookList.add(hpProBook); notebookList.add(hpEliteBook); notebookList.add(hpOmen);
            notebookList.add(lenovoThinkPad); notebookList.add(lenovoLegion); notebookList.add(appleMacBookAir);
            notebookList.add(appleMacBookPro);
        }
}
