import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the DebtComponent class.
 * 
 * @author Delvin Defoe and Curt Clifton. Modified Dec 31, 2010.
 */
public class DebtComponentTest {

	private DebtComponent justStudentLoans;
	private DebtComponent noMortage;
	private DebtComponent empty;

	private static double EPSILON = 0.0001;

	/**
	 * Creates some DebtComponent instances initialized with a variety of Debts.
	 */
	@Before
	public void setUp() {
		ArrayList<Debt> studentDebt = new ArrayList<Debt>();
		studentDebt.add(new Debt(Debt.CREDIT_CARD, "Discover", 400));
		studentDebt.add(new Debt(Debt.CREDIT_CARD, "Visa", 600));
		studentDebt
				.add(new Debt(Debt.AUTO_LOAN, "Toyota of Terre Haute", 4000));
		studentDebt.add(new Debt(Debt.STUDENT_LOAN, "Sallie Mae", 4500));
		studentDebt.add(new Debt(Debt.PERSONAL_LOAN,
				"Terre Haute Savings bank", 500));
		this.noMortage = new DebtComponent(studentDebt);

		studentDebt = new ArrayList<Debt>();
		studentDebt.add(new Debt(Debt.STUDENT_LOAN, "Fred's Bank", 2000));
		studentDebt.add(new Debt(Debt.STUDENT_LOAN, "Mom", 3000));
		this.justStudentLoans = new DebtComponent(studentDebt);

		this.empty = new DebtComponent(new ArrayList<Debt>());
	}

	/**
	 * Tests {@link DebtComponent#getTotalDebt()}.
	 */
	@Test
	public void testGetTotalDebt1() {
		assertEquals(0.0, this.empty.getTotalDebt(), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#getTotalDebt()}.
	 */
	@Test
	public void testGetTotalDebt2() {
		assertEquals(10000.0, this.noMortage.getTotalDebt(), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#getTotalDebt()}.
	 */
	@Test
	public void testGetTotalDebt3() {
		assertEquals(5000.0, this.justStudentLoans.getTotalDebt(), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind1() {
		assertEquals(0.0, this.empty.findTotalOfKind(Debt.CREDIT_CARD), EPSILON);
		assertEquals(0.0, this.empty.findTotalOfKind(Debt.STUDENT_LOAN),
				EPSILON);
		assertEquals(0.0, this.empty.findTotalOfKind(Debt.MORTGAGE), EPSILON);
		assertEquals(0.0, this.empty.findTotalOfKind(Debt.PERSONAL_LOAN),
				EPSILON);
		assertEquals(0.0, this.empty.findTotalOfKind(Debt.AUTO_LOAN), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind2() {
		assertEquals(0.0, this.noMortage.findTotalOfKind(Debt.MORTGAGE),
				EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind3() {
		assertEquals(4000.0, this.noMortage.findTotalOfKind(Debt.AUTO_LOAN),
				EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind4() {
		assertEquals(1000.0, this.noMortage.findTotalOfKind(Debt.CREDIT_CARD),
				EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind5() {
		assertEquals(5000.0, this.justStudentLoans
				.findTotalOfKind(Debt.STUDENT_LOAN), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findTotalOfKind(String)}.
	 */
	@Test
	public void testFindTotalOfKind6() {
		assertEquals(0.0, this.justStudentLoans
				.findTotalOfKind(Debt.PERSONAL_LOAN), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind1() {
		assertEquals(0.0, this.noMortage.findPercentageOfKind(Debt.MORTGAGE),
				EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind2() {
		assertEquals(40.0, this.noMortage.findPercentageOfKind(Debt.AUTO_LOAN),
				EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind3() {
		assertEquals(10.0, this.noMortage
				.findPercentageOfKind(Debt.CREDIT_CARD), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind4() {
		assertEquals(100.0, this.justStudentLoans
				.findPercentageOfKind(Debt.STUDENT_LOAN), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind5() {
		assertEquals(0.0, this.justStudentLoans
				.findPercentageOfKind(Debt.PERSONAL_LOAN), EPSILON);
	}

	/**
	 * Tests {@link DebtComponent#findPercentageOfKind(String)}.
	 */
	@Test
	public void testFindPercentageOfKind6() {
		assertEquals(0.0, this.empty.findPercentageOfKind(Debt.CREDIT_CARD),
				EPSILON);
		assertEquals(0.0, this.empty.findPercentageOfKind(Debt.STUDENT_LOAN),
				EPSILON);
		assertEquals(0.0, this.empty.findPercentageOfKind(Debt.MORTGAGE),
				EPSILON);
		assertEquals(0.0, this.empty.findPercentageOfKind(Debt.PERSONAL_LOAN),
				EPSILON);
		assertEquals(0.0, this.empty.findPercentageOfKind(Debt.AUTO_LOAN),
				EPSILON);
	}

}
