package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());
		return ret;
	}
}

//Kombinacja klawiszy alt + <- powrót kursora do poprzedniege miejsca
//Kombinacja klawiszy alt + -> skok kursora do miejsca z ktorego powrocono 