package ru.job4j.calculate;
/**
* Calculate. Вывод строки "Hello World!".
*
* @author Alexey Kulabuhov (mailto:jkulabuha@yandex.ru)
*/
public class Calculate {
	/**
	*Main.
	*@param args - args.
	*/
	public static void main (String[]args) {
		System.out.println("Hello World!");
	}
	/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
public String echo(String name) {
    return "Echo, echo, echo : " + name;
}
}
