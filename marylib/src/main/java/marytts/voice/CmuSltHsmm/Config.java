/**
 * Copyright 2011 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 * <p/>
 * This file is part of MARY TTS.
 * <p/>
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package marytts.voice.CmuSltHsmm;

import com.marytts.android.link.MaryLink;

import java.io.IOException;

import marytts.config.VoiceConfig;
import marytts.exceptions.MaryConfigurationException;


public class Config extends VoiceConfig {
    public Config() throws MaryConfigurationException, IOException {
        super(MaryLink.getContext().getAssets().open("marytts/voice/CmuSltHsmm/voice.config"));
    }
}
