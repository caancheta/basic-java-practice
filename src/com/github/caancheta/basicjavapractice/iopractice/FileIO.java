package com.github.caancheta.basicjavapractice.iopractice;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.nio.file.InvalidPathException;

/**
 * 
 * This custom FileIO interface provides one methods for creating and getting I/O stream for dealing with reading files from system.
 * 
 * This custom FileIO interface also provides one method for creating and getting I/O stream for dealing with writing file to system.
 * 
 * Both method throw an InvalidPathException if the path provided for use in I/O is invalid or non-existent.
 * 
 * @author caanchet
 * @since 1.8
 * */
public interface FileIO {
  
  /**
   * Return BufferedReader stream for reading file
   * 
   * @param path Absolute path of desired file
   * 
   * @return BufferedReader BufferedReader stream to open file for reading
   * 
   * @throws InvalidPathException if path string cannot be converted to path
   * */
  public BufferedReader initFileReader(String path) throws InvalidPathException;
  
  /**
   * Return PrintWriter stream for writing to a file
   * 
   * @param destPath Absolute path of desired file
   * 
   * @return BufferedReader stream to open file for writing
   * 
   * @throws InvalidPathException if path string cannot be converted to path
   * */
  public PrintWriter initFileWriter(String destPath) throws InvalidPathException;

}
