package br.com.ns.stream;

public class StreamStringImpl implements Stream {

    private final String source;
    private int currentIndex;

    public StreamStringImpl(String source) {
        if( source == null ){
            throw new IllegalArgumentException("Source cannot be null");
        }
        this.source = source;
    }

    public char getNext() {
       	return this.source.charAt(currentIndex++);
    }

    public boolean hasNext() {
        return currentIndex < this.source.length();
    }

    @Override
    public String toString() {
        return source;
    }
}
