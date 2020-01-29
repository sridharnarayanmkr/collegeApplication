package json.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleJSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] data = Files.readAllBytes(Paths.get("src/employee.txt"));
		ObjectMapper objmap = new ObjectMapper();
		Employee e = objmap.readValue(data, Employee.class);
		System.out.println(e);
	}


}

