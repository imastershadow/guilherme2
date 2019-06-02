/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraBOH;

/**
 *
 * hugo
 */


public class ConvertResultImpl implements IConvertResult {

	@Override
	public String valueToBinario(Integer value) {
		return Integer.toBinaryString(value);
       	}
        

}
