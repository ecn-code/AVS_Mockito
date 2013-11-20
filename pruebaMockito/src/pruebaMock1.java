import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;


public class pruebaMock1 {

	@Test
	public void test() {
		 List mockedList = Mockito.mock(List.class);
		 mockedList.add("once");
		 
		 mockedList.add("twice");
		 mockedList.add("twice");
		 
		 mockedList.add("three times");
		 mockedList.add("three times");
		 mockedList.add("three times");
		 
		 mockedList.add("five times");
		 mockedList.add("five times");	 
	
		 //following two verifications work exactly the same - times(1) is used by default
		 Mockito.verify(mockedList).add("once");
		 Mockito.verify(mockedList, Mockito.times(1)).add("once");
		 
		 //exact number of invocations verification
		 Mockito.verify(mockedList, Mockito.times(2)).add("twice");
		 Mockito.verify(mockedList, Mockito.times(3)).add("three times");
		 
		 //verification using never(). never() is an alias to times(0)
		 Mockito.verify(mockedList, Mockito.never()).add("never happened");
		 
		 //verification using atLeast()/atMost()
		 Mockito.verify(mockedList, Mockito.atLeastOnce()).add("three times");
		 Mockito.verify(mockedList, Mockito.atLeast(2)).add("five times");
		 Mockito.verify(mockedList, Mockito.atMost(3)).add("three times");
	}

}
