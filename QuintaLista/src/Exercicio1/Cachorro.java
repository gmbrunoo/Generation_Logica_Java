package Exercicio1;

public class Cachorro extends classeMaezona implements barulhoDoBicho{

	public void getImagem() {
		System.out.println(""
				+"         ____,'`-, \r\n"
				+"     _,--'   ,/::.; \r\n"
				+"   ,-'       ,/::,' `---.___        ___,_ \r\n"
				+"   |       ,:';:/        ;''`;'`--./ ,-^.;--. \r\n"
				+"   |:     ,:';,'         '         `.   ;`   `-. \r\n"
				+"   \\:.,:::/;/ -:.                   `  | `     `-. \r\n"
				+"    \\:::,'//__.;  ,;  ,  ,  :.`-.   :. |  ;       :. \r\n"
				+"     \\,',';/( )^. :'  ;  :   '__` `  :::`.       .:' ) \r\n"
				+"      |,' |'\'__,: ;      ; '/( )`.   :::`;       ' ,' \r\n"
				+"          |`--''            '\'__,' , ::::(       ,' \r\n"
				+"          `;    ,            `--' ,: :::,''\'  ,-' \r\n"
				+"            | ,;         ,    ,::'  ,:::   |,' \r\n"
				+"            |,:        .(          ,:::|   ` \r\n"
				+"            ::'_   _   ::         ,::/:| \r\n"
				+"           ,',' `-' '\'   `.      ,:::/,:| \r\n"
				+"          | : _  _   |   '     ,::,' ::: \r\n"
				+"          '\' O`'O  ,',   ,    :,'   ;:: \r\n"
				+"           '\' `-'`--',:' ,' , ,,'      :: \r\n"
				+"            ``:.:.__   ',-','        ::' \r\n"
				+"    -hrr-      `--.__, ,::.         ::' \r\n"
				+"                   |:  ::::.       ::' \r\n"
				+"                   |:  ::::::    ,::' \r\n"
				+"");
	}

	@Override
	public void emitirSom() {
		System.out.println("Latido do dog \n");
		
	}

	@Override
	public void barulhoBicho() {
		// TODO Auto-generated method stub
		
	}
}
