package day10;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrinterSoftwarer p = new PrinterSoftwarer();

		p.on_off();

		if (p.flag) {

			
			
			p.print_select();

			
			p.ink_check();
			p.paper_check();

			while (true) {

				String work = p.work_select();

				if (work.equals("충전")) {
					p.ink_charge();
					p.ink_check();
					p.paper_charge();
					p.paper_check();
				} else if (work.equals("인쇄")) {
					if (p.ink < 1 || p.paper < 1) {
						p.ink_check();
						p.paper_check();
					} else {

						String file = p.file();
						int paperQua = p.paperQua(file);
						if (paperQua > 0) {
							p.printing(paperQua, file);
						}
					}
				}
//				else if(work.equals("프린터추가")) {
//					
//				}
				else if (work.equals("확인")) {
					p.ink_check();
					p.paper_check();
				} else if (work.equals("종료")) {
					break;
				}

			}

		}

	}

}