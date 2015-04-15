import java.util.*;

public class GuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int c;
			int d;
			GameCharacter player = null;
			Scanner kb = new Scanner(System.in);
			do{
			System.out.println("Which Character would you like to play as?");
			System.out.println("1) Slash");
			System.out.println("2) Jimi Hendrix");
			System.out.println("3) Angus Young");
			c = kb.nextInt();
			}while(c > 3 && c < 0 );
			
			if(c==1)
			{
				 player = new GameCharacterSlash();
			}
			else if(c==2)
			{
				 player = new GameCharacterHendrix();
			}
			else
			{
				 player = new GameCharacterYoung();
			}
			
			System.out.println("Which guitar would you like to use?");
			do{
				System.out.println("1) Gibson SG");
				System.out.println("2) Fender Telecaster");
				System.out.println("3) Gibson Flying V");
				c = kb.nextInt();
			}while(c > 3 && c < 0 );
			
			if(c==1)
			{
				 player.guitar = new Gibson();
			}
			else if(c==2)
			{
				 player.guitar = new Fender();
			}
			else
			{
				 player.guitar = new FlyingV();
			}
			
			
			do{
				System.out.println("");
				System.out.println("What are you gonna do?!?!");
				System.out.println("1) Riff heavy with the beat");
				System.out.println("2) Rockin' soloooo");
				System.out.println("3) Nothing! get me outta here!");
				c = kb.nextInt();
			
			
			if(c == 1)
			{
				player.perform(player.getName());
			}
			else if(c == 2)
			{
				System.out.println("What kind of solo?");
				do{
					System.out.println("1) SMASSH GUITAR!");
					System.out.println("2) Jump off the stage!");
					System.out.println("3) Light it on fireeee!");
					d = kb.nextInt();
				}while(d > 3 && d < 0 );
				
				if(d == 1)
				{
					player.solos = new Smash();
					player.solo(player.getName());
				}
				else if(d == 2)
				{
					player.solos = new Jump();
					player.solo(player.getName());
				}
				else
				{
					player.solos = new Fire();
					player.solo(player.getName());
				}
				
			}
			else if(c == 3)
			{
				System.out.println(player.getName() + " drops his guitar and walks off the stage");
			}
			}while(c != 3);
	       //player2.playSolo();

	        //add code below to show the swapping of behaviors

	}

}
