import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.internal.InOrderImpl;


public class pruebaMock2 {

	@Test
	public void test() {
		 List firstMock = Mockito.mock(List.class);
		 List secondMock = Mockito.mock(List.class);
		 List mocks=new ArrayList();
		 mocks.add(firstMock);
		 mocks.add(secondMock);
		 //using mocks
		 firstMock.add("was called first");
		 secondMock.add("was called second");
		 
		 //create inOrder object passing any mocks that need to be verified in order
		 InOrder inOrder = new InOrderImpl(mocks);
		 
		 //following will make sure that firstMock was called before secondMock
		 inOrder.verify(firstMock).add("was called first");
		 inOrder.verify(secondMock).add("was called second");
		
	

	}
	}
