package esnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class PosixFileAttributesEsempio {

	public static void main(String[] args) throws IOException {
		Path file= Path.of("files","/file_prova_1.txt");
		DosFileAttributes dosAttr= Files.<DosFileAttributes>readAttributes(file, DosFileAttributes.class);
		
		if(!dosAttr.isReadOnly()) System.out.println("non è un file di sola lettura");
		if(!dosAttr.isHidden()) System.out.println("non è un file nascosto");
		
		file = Path.of("files", "/file_prova_2.txt");
		BasicFileAttributes basicAttr= Files.<BasicFileAttributes>readAttributes(file, BasicFileAttributes.class);
		
		System.out.println("Ultimo accesso: "+ basicAttr.lastAccessTime());
		System.out.println("Ultima modifica: "+ basicAttr.lastModifiedTime());	
		//Set<String> s1=new HashSet();
		//s1.add(((PosixFileAttributes)Files.<PosixFileAttributes>readAttributes(file,PosixFileAttributes.class )).owner().getName());
		
		//System.out.println(s1);;
		// PosixFileAttributes posixAttr = Files.getFileAttributeView(file, PosixFileAttributeView.class).readAttributes();
		  /*   System.out.format("%s %s%n",
		         attrs.owner().getName(),
		         PosixFilePermissions.toString(attrs.permissions()));
*/
		//PosixFileAttributes posixAttr=(PosixFileAttributes) Files.<PosixFileAttributes>readAttributes(file,PosixFileAttributes.class );
		/*System.out.println("Proprietario: "+posixAttr.owner().getName());
		System.out.println("Proprietario: "+posixAttr.group());
		for(PosixFilePermission p: posixAttr.permissions()) {
			System.out.println(p.values());
		}
		*/
	}

}
