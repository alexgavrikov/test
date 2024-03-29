package ru.ncedu.java.gavrikov.cfs;

/**
 * ���� ������ - ��������� ������������ ����������� ����������� <code>if, case, for, while</code> � Java.<br/>
 * �������������: ����������� � �������� ������, ��������� � ��������� ���������� � ������.<br/>
 * <p/>
 * �������<br/>
 * <dl>
 * <dt>�������� if</dt>
 * <dd>��������� �� ��� ���� ������� � ����������� �� �������. </dd>
 * <dt>�������� case</dt>
 * <dd>������� ��������� �������� � ����������� �� �������������� ��������.</dd>
 * <dt>�������� for</dt>
 * <dd>��������� � ���������� ��������� ������. </dd>
 * <dt>�������� while</dt>
 * <dd>���������� ��������� ����������� ������. </dd>
 * </dl>
 * <p/>
 * ����������<br/>
 * ������ ����� ������ ��� ����� ��������� � ��������� �������������� �������� (Exceptions).<br/>
 * ��� ��� ������ ��������� ���������� ������� ����������:<br/>
 * <code>
 * public class ControlFlowStatements1Impl implements ControlFlowStatements1 {  }
 * </code>
 * <br/>
 * ����� main �� �����������, �� ��� ���� � main �� ������ ���������, ��� ���������� ���� ������, ��������:
 * <code>
 * ControlFlowStatements1 object = new ControlFlowStatements1Impl();
 * System.out.println(object.decodeWeekday(4));
 * </code>
 * <br/>
 *  @author Elena Protsenko
 *  @author Alexey Evdokimov
 */
public interface ControlFlowStatements1{
    /**
     * ��� ������� ������������� x ����� �������� ��������� ������� f, ����������� ������������ ��������:<br/>
     * <pre>
     *        | 2*sin(x), ���� x>0,
     *  f(x)= |
     *        | 6-x, ���� x<=0.
     * </pre>
     * @return �������� f.
     */
    float getFunctionValue(float x);
    /**
     * ���� ����� ����� � ��������� 1�7.
     * ������� ������ � �������� ��� ������, ��������������� ����� �����:<br/>
     * 1 � Monday, 2 � Tuesday, 3 - Wednesday, 4 - Thursday, 5 - Friday, 6 - Saturday, 7 - Sunday.
     * @param weekday
     * @return ��������� ������������� weekday
     */
    String decodeWeekday(int weekday);

    /**
     * ������� ��������� ������, ���������� 8x5 ������������� ���������,
     * � ��������� ������� �������� ������������ ��� ��������: array[i][j] = i*j.
     * @return ������.
     */
    int[][] initArray();
    /**
     * ����� ����������� ������� ��������� ���������� �������.
     * @param array ������, ���������� ��� ������� ���� �������
     * @return ����������� ������� ������� array.
     */
    int getMinValue(int[][] array);

    /**
     * ��������� ������ ������ � ����� ����� $1000.
     * �� ��������� ������� ���� ������ ������ ������������� �� P ��������� (����� � �������������� ���������).<br/>
     * �� ��������� P ����������, ����� ������� ��� ������ ������ �������� $5000, � ����� �������� ������ ������.
     * @param P ������� �� ������
     * @return ���������� � ������ (� ���� ���������� ������ {@link BankDeposit}) ����� ����������� �������������� �������
     */
    BankDeposit calculateBankDeposit(double P);
    /**
     * ��������������� ��� ��� ������ {@link ControlFlowStatements1#calculateBankDeposit(double)}.<br/>
     * ����������: ����������� ��� ����� ���������, ��������� ����� ������ ������� ��� ��������,
     *  � �� ����� ��� ����� ��������� ������ �������� ������ ��� ������� ������
     *  (�������� ���������� � ������ � Java - ������ �� ��������, � �� �� ������).<br/>
     * ������: ��� ����� ���� �� �������� ��� ������������ ����, ������� ��������� ������ calculateBankDeposit?
     */
    public static class BankDeposit{
        /**
         * ����� ������ ���, ������� ����� �������� � �����.
         */
        public int years = 0;
        /**
         * ������ ������ ����� {@link #years} ���.
         */
        public double amount;

        @Override
        public String toString() {
            return years+" years: $"+amount;
        }
    }
}