package DP_AbstractFactory;

enum Location implements javax.xml.stream.Location {
    DEFAULT, USA, INDIA;

    @Override
    public int getLineNumber() {
        return 0;
    }

    @Override
    public int getColumnNumber() {
        return 0;
    }

    @Override
    public int getCharacterOffset() {
        return 0;
    }

    @Override
    public String getPublicId() {
        return null;
    }

    @Override
    public String getSystemId() {
        return null;
    }
}
