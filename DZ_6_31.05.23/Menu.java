import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Notebook> notebookList = Data.notebookList;
        int choice = 100;
        while (choice != 0) {
            System.out.println("Меню:");
            System.out.println("1. Просмотр всей базы");
            System.out.println("2. Поиск по фильтру");
            System.out.println("3. Сервис и ремонт");
            System.out.println("4. Продажа ноутбука");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAllNotebooks(notebookList);
                    break;
                case 2:
                    filterNotebooks(notebookList, scanner);
                    break;
                case 3:
                    serviceOperations(notebookList, scanner);
                    break;
                case 4:
                    performSale(notebookList, scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
                    break;
            }
            System.out.println();
        }
    }

    private static void displayAllNotebooks(List<Notebook> notebookList) {
        System.out.println("\nСписок ноутбуков:\n");
        for (Notebook notebook : notebookList) {
            System.out.println("Артикул: " + notebook.getArticle());
            System.out.println("Бренд: " + notebook.getBrand());
            System.out.println("Модель: " + notebook.getModel());
            System.out.println("Серийный номер: " + notebook.getSerialNumber());
            System.out.println("Цена: " + notebook.getPrice());
            System.out.println("Размер дисплея: " + notebook.getDisplaySize());
            System.out.println("Модель процессора: " + notebook.getProcessorModel());
            System.out.println("Тактовая частота процессора: " + notebook.getProcessorClock());
            System.out.println("Модель графического ускорителя: " + notebook.getGpuModel());
            System.out.println("Объем памяти графического ускорителя: " + notebook.getGpuMemory());
            System.out.println("Объем оперативной памяти: " + notebook.getOemSize());
            System.out.println("Наличие SSD: " + (notebook.hasSsdDisk() ? "Да" : "Нет"));
            System.out.println("Объем жесткого диска: " + notebook.getDiskSize());
            System.out.println("Операционная система: " + notebook.getOs());
            System.out.println("Доступность: " + (notebook.isAvailable() ? "Да" : "Нет"));
            System.out.println("Новый: " + (notebook.isNotUsed() ? "Да" : "Нет"));
            System.out.println("Восстановлен: " + (notebook.isRestored() ? "Да" : "Нет"));
            System.out.println();
        }
    }

    private static void filterNotebooks(List<Notebook> notebookList, Scanner scanner) {
        System.out.println("\nФильтрация ноутбуков:\n");
        System.out.println("Доступные параметры фильтрации:");
        System.out.println("1. Бренд");
        System.out.println("2. Размер дисплея");
        System.out.println("3. Процессор");
        System.out.println("4. Объем памяти");
        System.out.println("5. Показать ноутбуки с SSD");
        System.out.println("6. Показать ноутбуки в наличии");
        System.out.println("7. Показать только б/у");
        System.out.println("8. Показать восстановленные");
        System.out.println("9. Вернуться в главное меню");
        System.out.print("Выберите параметр фильтрации: ");

        int filterChoice = scanner.nextInt();
        scanner.nextLine(); // Считываем оставшийся символ новой строки после ввода числа

        switch (filterChoice) {
            case 1:
                filterByBrand(notebookList, scanner);
                break;
            case 2:
                filterByDisplaySize(notebookList, scanner);
                break;
            case 3:
                filterByProcessor(notebookList, scanner);
                break;
            case 4:
                filterByMemory(notebookList, scanner);
                break;
            case 5:
                filterBySsd(notebookList);
                break;
            case 6:
                filterByAvailability(notebookList);
                break;
            case 7:
                filterByUsage(notebookList);
                break;
            case 8:
                filterByRestoration(notebookList);
                break;
            case 9:
                break;
            default:
                System.out.println("Некорректный выбор. Попробуйте еще раз.");
                break;
        }
    }

    private static void filterByBrand(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите бренд для фильтрации: ");
        String brand = scanner.nextLine();

        System.out.println("\nВот все ноутбуки \"" + brand + "\":\n");
        for (Notebook notebook : notebookList) {
            if (notebook.getBrand().equalsIgnoreCase(brand)) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
            }
        }
    }

    private static void filterByDisplaySize(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите минимальный размер дисплея для фильтрации: ");
        double minDisplaySize = scanner.nextDouble();
        scanner.nextLine(); // Считываем оставшийся символ новой строки после ввода числа

        System.out.println("\nВот все ноутбуки с дисплеем от " + minDisplaySize + "\":\n");
        for (Notebook notebook : notebookList) {
            if (notebook.getDisplaySize() >= minDisplaySize) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
                System.out.println("Размер дисплея: " + notebook.getDisplaySize());
            }
        }
    }

    private static void filterByProcessor(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите модель процессора для фильтрации: ");
        String processorModel = scanner.nextLine();

        System.out.println("\nРезультаты фильтрации по процессору \"" + processorModel + "\":\n");
        for (Notebook notebook : notebookList) {
            if (notebook.getProcessorModel().toLowerCase().contains(processorModel.toLowerCase())) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
                System.out.println("Модель процессора: " + notebook.getProcessorModel());
                System.out.println("Тактовая частота процессора: " + notebook.getProcessorClock());
            }
        }
    }

    private static void filterByMemory(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите объем памяти для фильтрации: ");
        int memory = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nВот все ноутбуки с ОЕМ от " + memory + "ГБ:\n");
        for (Notebook notebook : notebookList) {
            if (notebook.getOemSize() == memory) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
                System.out.println("Объем оперативной памяти: " + notebook.getOemSize());
            }
        }
    }

    private static void filterBySsd(List<Notebook> notebookList) {
        System.out.println("\nВот все ноутбуки с SSD:\n");
        for (Notebook notebook : notebookList) {
            if (notebook.hasSsdDisk()) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
            }
        }
    }

    private static void filterByAvailability(List<Notebook> notebookList) {
        System.out.println("\nВот все ноутбуки в наличии:\n");
        for (Notebook notebook : notebookList) {
            if (notebook.isAvailable()) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
            }
        }
    }

    private static void filterByUsage(List<Notebook> notebookList) {
        System.out.println("\nВот все б/у ноутбуки:\n");
        for (Notebook notebook : notebookList) {
            if (!notebook.isNotUsed()) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
            }
        }
    }

    private static void filterByRestoration(List<Notebook> notebookList) {
        System.out.println("\nВот все восстановленные ноутбуки:\n");
        for (Notebook notebook : notebookList) {
            if (notebook.isRestored()) {
                System.out.println("Артикул: " + notebook.getArticle());
                System.out.println("Бренд: " + notebook.getBrand());
                System.out.println("Модель: " + notebook.getModel());
                System.out.println("Цена: " + notebook.getPrice());
            }
        }
    }

    private static void serviceOperations(List<Notebook> notebookList, Scanner scanner) {
        System.out.println("\nДоступные Сервисные работы:\n");
        System.out.println("1. Ремонт / переустановка ОС");
        System.out.println("2. Добавить SSD");
        System.out.println("3. Добавить памяти");
        System.out.println("4. Заменить процессор");
        System.out.println("5. Заменить видеокарту");
        System.out.println("9. Вернуться в главное меню");
        System.out.print("Выберите пункт: ");

        int serviceChoice = scanner.nextInt();
        scanner.nextLine();

        switch (serviceChoice) {
            case 1:
                RepairInstallOs(notebookList, scanner);
                break;
            case 2:
                AddSSD(notebookList, scanner);
                break;
            case 3:
                AddMemory(notebookList, scanner);
                break;
            case 4:
                ChangeProcessor(notebookList, scanner);
                break;
            case 5:
                ChangeVideo(notebookList, scanner);
                break;
            case 9:
                break;
            default:
                System.out.println("Некорректный выбор. Попробуйте еще раз.");
                break;
        }
    }

    private static void RepairInstallOs(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите артикль изменяемого ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите новую ОС: ");
        String newOS = scanner.nextLine();
        System.out.print("Введите новую цену: ");
        int newPrice = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setOs(newOS);
                notebook.setPrice((double) newPrice);
                notebook.setRestored(true);
            }
        }
        System.out.println("\nОС переустановлена!\n");
    }
    private static void AddSSD(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите артикль изменяемого ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите объём нового диска: ");
        int newSize = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setDiskSize(newSize);
                notebook.setSsdDisk(true);
                notebook.setRestored(true);
            }
        }
        System.out.println("\nSSD диск добавлен!\n");
    }
    private static void AddMemory(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите артикль изменяемого ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Сколько памяти добавляем? ");
        int newSize = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setOemSize(newSize);
                notebook.setRestored(true);
            }
        }
        System.out.println("\nПамять добавлена!\n");
    }
    private static void ChangeProcessor(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите артикль изменяемого ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите название нового процессора: ");
        String newProcessor = scanner.nextLine();
        System.out.print("Введите тактовую частоту нового процессора: ");
        int newClock = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setProcessorModel(newProcessor);
                notebook.setProcessorClock(newClock);
                notebook.setRestored(true);
            }
        }
        System.out.println("\nПроцессор заменен!!\n");
    }
    private static void ChangeVideo(List<Notebook> notebookList, Scanner scanner) {
        System.out.print("Введите артикль изменяемого ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите название новой видеокарты: ");
        String newGpu = scanner.nextLine();
        System.out.print("Введите объём памяти новой видеокарты: ");
        int newGpuMemory = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setGpuModel(newGpu);
                notebook.setGpuMemory(newGpuMemory);
                notebook.setRestored(true);
            }
        }
        System.out.println("\nВидеокарта заменена!!\n");
    }

    private static void performSale(List<Notebook> notebookList, Scanner scanner) {
        System.out.println("\nВыбран пункт \"Продажа\".\n");
        System.out.print("Введите артикль проданного ноутбука: ");
        int article = scanner.nextInt();
        scanner.nextLine();
        for (Notebook notebook : notebookList) {
            if (notebook.getArticle() == article) {
                notebook.setAvailable(false);
            }
        }
        System.out.println("\nНоутбук продан!\n");
    }
}
