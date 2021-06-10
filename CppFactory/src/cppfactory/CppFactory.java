package cppfactory;

import interfaces.ISyntaxHighlighter;
import interfaces.IIDEFactory;
import interfaces.ICompiler;
/**
 *
 * @author luisborges
 */
public class CppFactory implements IIDEFactory{
    
    @Override
    public ISyntaxHighlighter createSyntaxHighligher() {
        return new CppSyntaxHighlighter();
    }

    @Override
    public ICompiler createCompiler() {
        return new CppCompiler();
    }

    @Override
    public String[] supportedExtensions() {
        String[] extensions = {"cpp"};
        return extensions;
    }
}
