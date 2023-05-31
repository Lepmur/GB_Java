public class Notebook {
    private int article;
    private double price;
    private String brand;
    private String model;
    private String serialNumber;
    private double displaySize;
    private String processorModel;
    private int processorClock;
    private String gpuModel;
    private int gpuMemory;
    private int oemSize;
    private boolean ssdDisk;
    private int diskSize;
    private String os;
    private boolean available;
    private boolean notUsed;
    private boolean restored;

    // я не стал создавать тут перегрузки для конструктора, намеренно
    public Notebook(int article, int price, String brand, String model, String serialNumber, double displaySize, String processorModel,
                    int processorClock, String gpuModel, int gpuMemory, int oemSize, boolean ssdDisk, int diskSize,
                    String os, boolean available, boolean notUsed, boolean restored) {
        this.article = article; this.brand = brand; this. model = model; this. serialNumber = serialNumber;
        this.displaySize = displaySize; this.processorModel = processorModel; this.processorClock = processorClock;
        this.gpuModel = gpuModel; this.gpuMemory = gpuMemory; this.oemSize = oemSize; this.ssdDisk = ssdDisk;
        this.diskSize = diskSize; this.os = os; this.available = available; this.notUsed = notUsed; this.restored = restored;
    }

    // СЕТТЕРЫ
    public void setArticle(int article) { // смена артикула
        this.article = article;
    }
    public void setNotUsed(boolean notUsed) {
        this.notUsed = notUsed;
    }
    public void setRestored(boolean restored) {
        this.restored = restored;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setSsdDisk(boolean ssdDisk) {
        this.ssdDisk = ssdDisk;
    }
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }
    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }
    public void setGpuMemory(int gpuMemory) {
        this.gpuMemory = gpuMemory;
    }
    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }
    public void setProcessorClock(int processorClock) {
        this.processorClock = processorClock;
    }
    public void setOemSize(int oemSize) {
        this.oemSize += oemSize;
    }

    // ГЕТТЕРЫ
    public int getArticle() {
        return article;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public double getDisplaySize() {
        return displaySize;
    }
    public String getProcessorModel() {
        return processorModel;
    }
    public int getProcessorClock() {
        return processorClock;
    }
    public int getOemSize() {
        return oemSize;
    }
    public String getGpuModel() {
        return gpuModel;
    }
    public int getGpuMemory() {
        return gpuMemory;
    }
    public int getDiskSize() {
        return diskSize;
    }
    public String getOs() {
        return os;
    }

    public boolean isRestored() {
        return restored;
    }
    public boolean isNotUsed() {
        return notUsed;
    }
    public boolean isAvailable() {
        return available;
    }
    public boolean hasSsdDisk() {
        return ssdDisk;
    }
}
