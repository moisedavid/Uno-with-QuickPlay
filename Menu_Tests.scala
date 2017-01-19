package menu_commands

import org.scalatest.FunSpec
import org.scalatest.Matchers


class Menu_Test extends FunSpec with Matchers {
  
   describe("The Uno (Classic Mode) Simulation") {
    describe("has a menu") {
      
      //******* SHOW GAME AREA *******
      it("can show the game area, including the deck, discard pile, and cards in each player's hand") {

        val expectedResult = 
            "Deck:\n" +
            "[ ]\n" +
            "\n" +
            "Discard Pile:\n" +
            "[ ]\n" +
            "\n" +
            "Cards in Hand:\n" +
            "PLAYER 1 = [][][][][][][], PLAYER 2 = [][][][][][][], PLAYER 3 = [][][][][][][], PLAYER 4 = [][][][][][][]\n"
            
        Menu.showGameArea should be(expectedResult)
      }   
      
      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {     
        val expectedResult = "PLAYER 1,	PLAYER 2, PLAYER 3, PLAYER 4"
        Menu.showPlayerOrder should be(expectedResult)  
      }

      //******* ADVANCE ORDER *******
      it("can advance the player order") {     
        val expectedResult_0_advances = "PLAYER 1, PLAYER 2, PLAYER 3, PLAYER 4"
        val expectedResult_1_advances = "PLAYER 2, PLAYER 3, PLAYER 4, PLAYER 1"
        val expectedResult_2_advances = "PLAYER 3, PLAYER 4, PLAYER 1, PLAYER 2"       
        val expectedResult_4_advances = "PLAYER 4, PLAYER 1, PLAYER 2, PLAYER 3"
        
        Menu.showPlayerOrder should be(expectedResult_0_advances)  
        
        Menu.advancePlayerOrder should be(expectedResult_1_advances)  
        
        Menu.advancePlayerOrder 
        Menu.showPlayerOrder should be(expectedResult_2_advances)
        
        Menu.advancePlayerOrder   // 3 advances
        
        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_4_advances)
        Menu.showPlayerOrder should be(expectedResult_0_advances)
      }
      
      
    }
  }
}