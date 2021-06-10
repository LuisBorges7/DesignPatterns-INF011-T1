package javafactory;

import interfaces.ISyntaxHighlighter;
import interfaces.IIDEFactory;
import interfaces.ICompiler;
/**
 *
 * @author luisborges
 */
public class JavaFactory implements IIDEFactory{
    
    @Override
    public ISyntaxHighlighter createSyntaxHighligher() {
        return new JavaSyntaxHighlighter();
    }

    @Override
    public ICompiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public String[] supportedExtensions() {
        String[] extensions = {"java"};
        return extensions;
    }
}
