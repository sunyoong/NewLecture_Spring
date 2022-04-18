package diPrj.di;

import diPrj.di.entity.Exam;
import diPrj.di.entity.NewlecExam;
import diPrj.di.ui.ExamConsole;
import diPrj.di.ui.GridExamConsole;
import diPrj.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		// Entity
		Exam exam = new NewlecExam();
		ExamConsole console1 = new InlineExamConsole(exam); // DI
		ExamConsole console = new GridExamConsole(exam);
		
		console1.print();
		console.print();
		
	}

}
