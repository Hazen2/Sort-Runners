import javax.swing.JOptionPane;

/**
 * This program will ask the user to enter the names of three runners
 * and their times. It will then sort the list of runners by their times.
 */

public class SortRunners
{
  public static void main(String[] args)
  {
    String keyboardInput;
    String runner1;
    String runner2;
    String runner3;
    int time1;
    int time2;
    int time3;
    
    // Prompt the user to enter the name of the first runner.
    runner1 = JOptionPane.showInputDialog("Enter the name of the first runner.");
    runner2 = JOptionPane.showInputDialog("Enter the name of the second runner.");
    runner3 = JOptionPane.showInputDialog("Enter the name of the third runner.");
    
    // Prompt the user for the runner's time and convert to integer value.
    keyboardInput = JOptionPane.showInputDialog("Enter the time " + 
                                                  runner1 + " completed the race.");
    time1 = Integer.parseInt(keyboardInput);
    keyboardInput = JOptionPane.showInputDialog("Enter the time " + runner2 +
                                                  " completed the race.");
    time2 = Integer.parseInt(keyboardInput);
    keyboardInput = JOptionPane.showInputDialog("Enter the time " + runner3 +
                                                  " completed the race.");
    time3 = Integer.parseInt(keyboardInput);
        
    // Sort runners with their times and display the results.
    
    // Runner1 is first, runner2 second, runner3 third.
    if (time1 < time2 && time2 < time3)
    {
      JOptionPane.showMessageDialog(null, runner1 + ", you are first. " + runner2 +
                                   ", you are second." + runner3 + ", you are 3rd.");
    }
    
    // Runner2 is first, runner1 second, runner3 third.
    else if (time2 < time1 & time1 < time3)
    {
      JOptionPane.showMessageDialog(null, runner2 + ", you are first. " + runner1 +
                                   ", you are second." + runner3 + ", you are 3rd.");
    }
    
    // Runner3 first, runner2 second, runner1 third.
    else if (time3 < time2 & time2 < time1)  
    {
      JOptionPane.showMessageDialog(null, runner3 + ", you are first. " + runner2 +
                                   ", you are second." + runner1 + ", you are 3rd.");
    }
    
    // Runner1 first, runner3 third, runner2 third.
    else if (time1 < time3 && time3 < time2)
    {
      JOptionPane.showMessageDialog(null, runner1 + ", you are first. " + runner3 +
                                   ", you are second." + runner2 + ", you are 3rd.");
    }
    
    // Runner2 is first, runner3 second, runner1 third.
    else if (time2 < time3 && time3 < time1)
    {
      JOptionPane.showMessageDialog(null, runner2 + ", you are first. " + runner3 +
                                   ", you are second." + runner1 + ", you are 3rd.");
    }
    
    // Runner3 is first, runner1 is second, runner2 third.
    else
      {
      JOptionPane.showMessageDialog(null, runner3 + ", you are first. " + runner1 +
                                   ", you are second." + runner2 + ", you are 3rd.");
    }
    
 System.exit(0);   
  }
}
