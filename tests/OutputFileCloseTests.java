import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class OutputFileCloseTests {

	@Test
	public void testCloseOutputFile() {
		try{
			OutputFile.openOutputFile("output.txt");
			assertEquals(true, OutputFile.isOpen);
			OutputFileClose.closeOutputFile();
			assertEquals(false, OutputFile.isOpen);
			assertEquals(null, OutputFile.outputFile);
			assertEquals(null, OutputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testCloseOutputFileFileNotOpen() {
		try{
			
			OutputFileClose.closeOutputFile();
			assertEquals(false, OutputFile.isOpen);
			assertEquals(null, OutputFile.outputFile);
			assertEquals(null, OutputFile.errorMsg);
		}
		catch(Exception e){
			fail("exception occurred in testCloseOutputFile: " + e.getMessage());
		}
		
	}


}
