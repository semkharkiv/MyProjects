package calc;
/*
Напишите программу "Калькулятор", производящую вычисления с двумя числами c дробной частью.
Тип данных вводимых аргументов должен быть Double.
Пользователь должен ввести с клавиатуры знак выполняемой математической операции в формате строки,
а затем программа должна преобразовать введенную строку в значение переменной типа Char
(получить из строки первый символ методом string.charAt(0);).
Требуется произвести проверку введенных данных:
Если пользователь ввёл знак операции, отличный от +, -, *, / - выводить сообщение о том,
что указанная операция не поддерживается программой.
Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента
ввёл значение 0, то программа должна вывести сообщение о том, что на 0 делить нельзя.
В обеих ситуациях программа должна прекращать дальнейшую работу.
Результат вычислений необходимо вывести с точностью до двух чисел после запятой в формате
<значение переменной argumentOne> <знак математической операции> <значение переменной argumentTwo> = <значение переменной результата>.
 */
public class Calculator {
    public double sum(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
}
