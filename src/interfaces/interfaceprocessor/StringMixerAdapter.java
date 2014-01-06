package interfaces.interfaceprocessor;

public class StringMixerAdapter implements Processor {

	StringMixer stringMixer;
	
	@Override
	public String name() {
		return "StringMixerAdapter";
	}

	public StringMixerAdapter(StringMixer stringMixer){
		this.stringMixer = stringMixer;
	}
	
	@Override
	public Object process(Object input) {
		return stringMixer.process((String) input);
	}

}
