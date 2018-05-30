/**
 * Students often incur debt while in college. The kinds of debt might include
 * credit card debt, a student loan, an auto loan, a personal loan, and, on rare
 * occasions, a mortgage.
 * 
 * A Debt object models a debt item that may appear on a student's credit
 * report.
 * 
 * @author Delvin Defoe and Curt Clifton. Created on Dec 23, 2010.
 * 
 */
public class Debt {

	/**
	 * Constant for credit card debt.
	 */
	public static final String CREDIT_CARD = "Credit Card Debt";

	/**
	 * Constant for a student loan.
	 */
	public static final String STUDENT_LOAN = "Student Loan";

	/**
	 * Constant for a mortgage.
	 */
	public static final String MORTGAGE = "Mortgage";

	/**
	 * Constant for a personal loan.
	 */
	public static final String PERSONAL_LOAN = "Personal Loan";

	/**
	 * Constant for an auto loan.
	 */
	public static final String AUTO_LOAN = "Auto Loan";

	/**
	 * Instance fields of a Debt object.
	 */
	private String debtKind;
	private String companyOwed;
	private double amountOwed;

	/**
	 * Constructs a Debt object.
	 * 
	 * @param kind
	 *            The kind of debt, see constants {@link Debt#CREDIT_CARD}, etc.
	 * @param company
	 *            The company owed
	 * @param amount
	 *            The debt amount
	 */
	public Debt(String kind, String company, double amount) {
		this.debtKind = kind;
		this.companyOwed = company;
		this.amountOwed = amount;
	}

	/**
	 * Constructs a Debt object with no company owed and a default balance of 0.
	 * 
	 * @param kind
	 *            The kind of debt, see constants {@link Debt#CREDIT_CARD}, etc.
	 */
	public Debt(String kind) {
		this(kind, "", 0.0);
	}

	/**
	 * Returns the name of the company owed, or empty string if unknown.
	 * 
	 * @return name of the company owed
	 */
	public String getCompanyOwed() {
		return this.companyOwed;
	}

	/**
	 * Changes the name of the company owed.
	 * 
	 * @param companyOwed
	 *            Name of the company owed, or empty string if unknown.
	 */
	public void setCompanyOwed(String companyOwed) {
		this.companyOwed = companyOwed;
	}

	/**
	 * Returns the amount that is owed on this Debt.
	 * 
	 * @return amount owed on this Debt.
	 */
	public double getAmountOwed() {
		return this.amountOwed;
	}

	/**
	 * Changes the amount owed by either increasing this Debt (a positive
	 * amount) or decreasing it (a negative amount).
	 * 
	 * @param changeAmount
	 *            amount to change Debt by.
	 */
	public void changeAmountOwed(double changeAmount) {
		this.amountOwed += changeAmount;
	}

	/**
	 * Returns the debt kind for this Debt.
	 * 
	 * @return the kind of Debt this is.
	 */
	public String getDebtKind() {
		return this.debtKind;
	}
}
