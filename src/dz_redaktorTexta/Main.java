package dz_redaktorTexta;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

//Фрейм, содержащий панель с кнопками
public class Main extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    //Панели
    private JPanel buttonPanel;
    private JPanel textPanel;
    private JPanel textBoxPanel;

    //Текстбокс
    private JTextField textbox;

    //Меню
    private JMenuBar menuBar;
    private JMenu fontNameMenu;
    private JMenu fontSizeMenu;
    private JMenu fontColorMenu;
    private JMenuItem fontNameMenuItem;
    private JMenuItem fontSizeMenuItem;
    private JMenuItem fontColorMenuItem;

    //Шрифт
    private String fontName;
    private int fontSize;
    private Color fontColor;
    //Кнопки
    private JButton lableButton;

    //Компоненты списка
    private JLabel text;


    public Main() {
        setTitle("Text redactor");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Создание кнопок
        lableButton = new JButton("Показать");

        //Меню
        menuBar = new JMenuBar();
        fontNameMenu = new JMenu("Шрифт");
        fontSizeMenu = new JMenu("Размер");
        fontColorMenu = new JMenu("Цвет");

        //Параметры текста по умолчанию
        fontName = "Verdana";
        fontSize = 14;
        fontColor = Color.black;


        //Ввод текст
        textbox = new JTextField("Введите текст", 20);

        //Текстовая метка
        text = new JLabel(textbox.getText());

        //Создание панелей
        buttonPanel = new JPanel();
        textPanel = new JPanel();
        textBoxPanel = new JPanel();

        // добавление элементов к панелям
        textPanel.add(text);
        buttonPanel.add(lableButton);
        textBoxPanel.add(textbox);
        menuBar.add(fontNameMenu);
        menuBar.add(fontSizeMenu);
        menuBar.add(fontColorMenu);

        //Скрытие метки и списка
        text.setVisible(false);


        //Обработка события нажатия кнопки "Показать"
        lableButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                text.setVisible(true);
                text.setForeground(fontColor);
                text.setFont(new Font(fontName, Font.PLAIN, fontSize));
                text.setText("Результат: " + textbox.getText());
            }
        });

        //Меню шрифта
        // элемент 1
        fontNameMenuItem = new JMenuItem("Verdana");
        fontNameMenu.add(fontNameMenuItem);
        fontNameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontName = "Verdana";
            }
        });
        // элемент 2
        fontNameMenuItem = new JMenuItem("Monotype Corsiva");
        fontNameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontName = "Monotype Corsiva";
            }
        });
        fontNameMenu.add(fontNameMenuItem);
        // элемент 3
        fontNameMenuItem = new JMenuItem("Times New Roman");
        fontNameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontName = "Times New Roman";
            }
        });
        fontNameMenu.add(fontNameMenuItem);
        // элемент 4
        fontNameMenuItem = new JMenuItem("Bickham Script One");
        fontNameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontName = "Bickham Script One";
            }
        });
        fontNameMenu.add(fontNameMenuItem);
        // элемент 5
        fontNameMenuItem = new JMenuItem("MS Serif");
        fontNameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontName = "MS Serif";
            }
        });
        fontNameMenu.add(fontNameMenuItem);

        //Меню размера шрифта
        //Элемент 1
        fontSizeMenuItem = new JMenuItem("8");
        fontSizeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize = 8;
            }
        });
        fontSizeMenu.add(fontSizeMenuItem);
        //Элемент 2
        fontSizeMenuItem = new JMenuItem("12");
        fontSizeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize = 12;
            }
        });
        fontSizeMenu.add(fontSizeMenuItem);
        //Элемент 3
        fontSizeMenuItem = new JMenuItem("16");
        fontSizeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize = 16;
            }
        });
        fontSizeMenu.add(fontSizeMenuItem);
        //Элемент 4
        fontSizeMenuItem = new JMenuItem("20");
        fontSizeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontSize = 20;
            }
        });
        fontSizeMenu.add(fontSizeMenuItem);

        //Меню цвета текста
        //Элемент 1
        fontColorMenuItem = new JMenuItem("Черный");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.black;
            }
        });
        fontColorMenu.add(fontColorMenuItem);
        //Элемент 2
        fontColorMenuItem = new JMenuItem("Красный");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.RED;
            }
        });
        fontColorMenu.add(fontColorMenuItem);
        //Элемент 3
        fontColorMenuItem = new JMenuItem("Зеленый");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.GREEN;
            }
        });
        fontColorMenu.add(fontColorMenuItem);
        //Элемент 4
        fontColorMenuItem = new JMenuItem("Синий");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.BLUE;
            }
        });
        fontColorMenu.add(fontColorMenuItem);
        //Элемент 5
        fontColorMenuItem = new JMenuItem("Пурпурный");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.MAGENTA;
            }
        });
        fontColorMenu.add(fontColorMenuItem);
        //Элемент 6
        fontColorMenuItem = new JMenuItem("Оранжевый");
        fontColorMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontColor = Color.ORANGE;
            }
        });
        fontColorMenu.add(fontColorMenuItem);

        //добавление панелей к фрейму
        add(buttonPanel, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);
        add(textBoxPanel, BorderLayout.NORTH);

        setJMenuBar(menuBar);

        //Отображение фрейма в середине
        setLocationRelativeTo(null);
        //Завершение программы по закрытию фрейма
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        Main main = new Main();
        main.setVisible(true);
    }

}
