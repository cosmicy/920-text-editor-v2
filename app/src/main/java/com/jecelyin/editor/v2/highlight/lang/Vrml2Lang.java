/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class Vrml2Lang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"#\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"javascript::MAIN\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"appearance\"},{\"tag\":\"KEYWORD1\",\"text\":\"children\"},{\"tag\":\"KEYWORD1\",\"text\":\"proxy\"},{\"tag\":\"KEYWORD1\",\"text\":\"addChildren\"},{\"tag\":\"KEYWORD1\",\"text\":\"removeChildren\"},{\"tag\":\"KEYWORD1\",\"text\":\"collideTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"geometry\"},{\"tag\":\"KEYWORD1\",\"text\":\"material\"},{\"tag\":\"KEYWORD1\",\"text\":\"texture\"},{\"tag\":\"KEYWORD1\",\"text\":\"textureTransform\"},{\"tag\":\"KEYWORD1\",\"text\":\"ambientIntensity\"},{\"tag\":\"KEYWORD1\",\"text\":\"diffuseColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"emissiveColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"shininess\"},{\"tag\":\"KEYWORD1\",\"text\":\"specularColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"transparency\"},{\"tag\":\"KEYWORD1\",\"text\":\"size\"},{\"tag\":\"KEYWORD1\",\"text\":\"bottomRadius\"},{\"tag\":\"KEYWORD1\",\"text\":\"height\"},{\"tag\":\"KEYWORD1\",\"text\":\"side\"},{\"tag\":\"KEYWORD1\",\"text\":\"bottom\"},{\"tag\":\"KEYWORD1\",\"text\":\"radius\"},{\"tag\":\"KEYWORD1\",\"text\":\"top\"},{\"tag\":\"KEYWORD1\",\"text\":\"bboxCenter\"},{\"tag\":\"KEYWORD1\",\"text\":\"bboxSize\"},{\"tag\":\"KEYWORD1\",\"text\":\"string\"},{\"tag\":\"KEYWORD1\",\"text\":\"length\"},{\"tag\":\"KEYWORD1\",\"text\":\"maxExtent\"},{\"tag\":\"KEYWORD1\",\"text\":\"fontStyle\"},{\"tag\":\"KEYWORD1\",\"text\":\"family\"},{\"tag\":\"KEYWORD1\",\"text\":\"style\"},{\"tag\":\"KEYWORD1\",\"text\":\"spacing\"},{\"tag\":\"KEYWORD1\",\"text\":\"justify\"},{\"tag\":\"KEYWORD1\",\"text\":\"horizontal\"},{\"tag\":\"KEYWORD1\",\"text\":\"leftToRight\"},{\"tag\":\"KEYWORD1\",\"text\":\"topToBottom\"},{\"tag\":\"KEYWORD1\",\"text\":\"language\"},{\"tag\":\"KEYWORD1\",\"text\":\"translation\"},{\"tag\":\"KEYWORD1\",\"text\":\"position\"},{\"tag\":\"KEYWORD1\",\"text\":\"rotation\"},{\"tag\":\"KEYWORD1\",\"text\":\"scale\"},{\"tag\":\"KEYWORD1\",\"text\":\"scaleOrientation\"},{\"tag\":\"KEYWORD1\",\"text\":\"center\"},{\"tag\":\"KEYWORD1\",\"text\":\"key\"},{\"tag\":\"KEYWORD1\",\"text\":\"keyValue\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_fraction\"},{\"tag\":\"KEYWORD1\",\"text\":\"value_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"enabled\"},{\"tag\":\"KEYWORD1\",\"text\":\"isActive\"},{\"tag\":\"KEYWORD1\",\"text\":\"isOver\"},{\"tag\":\"KEYWORD1\",\"text\":\"touchTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"hitPoint_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"hitNormal_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"hitTexcoord_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"orientation_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"position_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"autoOffset\"},{\"tag\":\"KEYWORD1\",\"text\":\"offset\"},{\"tag\":\"KEYWORD1\",\"text\":\"maxPosition\"},{\"tag\":\"KEYWORD1\",\"text\":\"minPosition\"},{\"tag\":\"KEYWORD1\",\"text\":\"translation_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"trackPoint_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"rotation_changeds\"},{\"tag\":\"KEYWORD1\",\"text\":\"diskAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"maxAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"minAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"choice\"},{\"tag\":\"KEYWORD1\",\"text\":\"whichChoice\"},{\"tag\":\"KEYWORD1\",\"text\":\"axisOfRotation\"},{\"tag\":\"KEYWORD1\",\"text\":\"point\"},{\"tag\":\"KEYWORD1\",\"text\":\"coord\"},{\"tag\":\"KEYWORD1\",\"text\":\"color\"},{\"tag\":\"KEYWORD1\",\"text\":\"coordIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"colorIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"colorPerVertex\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_coordIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_colorIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"texCoord\"},{\"tag\":\"KEYWORD1\",\"text\":\"texCoordIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"normalIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"normalPerVertex\"},{\"tag\":\"KEYWORD1\",\"text\":\"ccw\"},{\"tag\":\"KEYWORD1\",\"text\":\"convex\"},{\"tag\":\"KEYWORD1\",\"text\":\"solid\"},{\"tag\":\"KEYWORD1\",\"text\":\"creaseAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_texCoordIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_normalIndex\"},{\"tag\":\"KEYWORD1\",\"text\":\"xDimension\"},{\"tag\":\"KEYWORD1\",\"text\":\"xSpacing\"},{\"tag\":\"KEYWORD1\",\"text\":\"zDimension\"},{\"tag\":\"KEYWORD1\",\"text\":\"zSpacing\"},{\"tag\":\"KEYWORD1\",\"text\":\"crossSection\"},{\"tag\":\"KEYWORD1\",\"text\":\"spine\"},{\"tag\":\"KEYWORD1\",\"text\":\"beginCap\"},{\"tag\":\"KEYWORD1\",\"text\":\"endCap\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_spine\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_crossSection\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_scale\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_orientation\"},{\"tag\":\"KEYWORD1\",\"text\":\"url\"},{\"tag\":\"KEYWORD1\",\"text\":\"repeatS\"},{\"tag\":\"KEYWORD1\",\"text\":\"repeatT\"},{\"tag\":\"KEYWORD1\",\"text\":\"image\"},{\"tag\":\"KEYWORD1\",\"text\":\"loop\"},{\"tag\":\"KEYWORD1\",\"text\":\"speed\"},{\"tag\":\"KEYWORD1\",\"text\":\"startTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"stopTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"duration_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"vector\"},{\"tag\":\"KEYWORD1\",\"text\":\"on\"},{\"tag\":\"KEYWORD1\",\"text\":\"location\"},{\"tag\":\"KEYWORD1\",\"text\":\"intensity\"},{\"tag\":\"KEYWORD1\",\"text\":\"attenuation\"},{\"tag\":\"KEYWORD1\",\"text\":\"direction\"},{\"tag\":\"KEYWORD1\",\"text\":\"beamWidth\"},{\"tag\":\"KEYWORD1\",\"text\":\"cutOffAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"skyColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"skyAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"groundColor\"},{\"tag\":\"KEYWORD1\",\"text\":\"groundAngle\"},{\"tag\":\"KEYWORD1\",\"text\":\"backUrl\"},{\"tag\":\"KEYWORD1\",\"text\":\"bottomurl\"},{\"tag\":\"KEYWORD1\",\"text\":\"fronturl\"},{\"tag\":\"KEYWORD1\",\"text\":\"leftUrl\"},{\"tag\":\"KEYWORD1\",\"text\":\"rightUrl\"},{\"tag\":\"KEYWORD1\",\"text\":\"topUrl\"},{\"tag\":\"KEYWORD1\",\"text\":\"set_bind\"},{\"tag\":\"KEYWORD1\",\"text\":\"bind_changed\"},{\"tag\":\"KEYWORD1\",\"text\":\"visibilityRange\"},{\"tag\":\"KEYWORD1\",\"text\":\"fogType\"},{\"tag\":\"KEYWORD1\",\"text\":\"duration\"},{\"tag\":\"KEYWORD1\",\"text\":\"pitch\"},{\"tag\":\"KEYWORD1\",\"text\":\"priority\"},{\"tag\":\"KEYWORD1\",\"text\":\"spatialize\"},{\"tag\":\"KEYWORD1\",\"text\":\"maxFront\"},{\"tag\":\"KEYWORD1\",\"text\":\"maxBack\"},{\"tag\":\"KEYWORD1\",\"text\":\"minFront\"},{\"tag\":\"KEYWORD1\",\"text\":\"minBack\"},{\"tag\":\"KEYWORD1\",\"text\":\"level\"},{\"tag\":\"KEYWORD1\",\"text\":\"range\"},{\"tag\":\"KEYWORD1\",\"text\":\"fieldOfView\"},{\"tag\":\"KEYWORD1\",\"text\":\"description\"},{\"tag\":\"KEYWORD1\",\"text\":\"jump\"},{\"tag\":\"KEYWORD1\",\"text\":\"isBound\"},{\"tag\":\"KEYWORD1\",\"text\":\"bindTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"type\"},{\"tag\":\"KEYWORD1\",\"text\":\"avatarSize\"},{\"tag\":\"KEYWORD1\",\"text\":\"headLight\"},{\"tag\":\"KEYWORD1\",\"text\":\"visibilityLimit\"},{\"tag\":\"KEYWORD1\",\"text\":\"enterTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"exitTime\"},{\"tag\":\"KEYWORD1\",\"text\":\"collide\"},{\"tag\":\"KEYWORD1\",\"text\":\"parameter\"},{\"tag\":\"KEYWORD1\",\"text\":\"title\"},{\"tag\":\"KEYWORD1\",\"text\":\"info\"},{\"tag\":\"KEYWORD1\",\"text\":\"mustEvaluate\"},{\"tag\":\"KEYWORD1\",\"text\":\"directOutput\"},{\"tag\":\"KEYWORD1\",\"text\":\"cycleInterval\"},{\"tag\":\"KEYWORD1\",\"text\":\"cycleTime\"},{\"tag\":\"KEYWORD2\",\"text\":\"META\"},{\"tag\":\"KEYWORD2\",\"text\":\"Shape\"},{\"tag\":\"KEYWORD2\",\"text\":\"Appearance\"},{\"tag\":\"KEYWORD2\",\"text\":\"Material\"},{\"tag\":\"KEYWORD2\",\"text\":\"Box\"},{\"tag\":\"KEYWORD2\",\"text\":\"Cone\"},{\"tag\":\"KEYWORD2\",\"text\":\"Cylinder\"},{\"tag\":\"KEYWORD2\",\"text\":\"Sphere\"},{\"tag\":\"KEYWORD2\",\"text\":\"Group\"},{\"tag\":\"KEYWORD2\",\"text\":\"Text\"},{\"tag\":\"KEYWORD2\",\"text\":\"FontStyle\"},{\"tag\":\"KEYWORD2\",\"text\":\"Transform\"},{\"tag\":\"KEYWORD2\",\"text\":\"TimeSensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"PositionInterpolator\"},{\"tag\":\"KEYWORD2\",\"text\":\"OrientationInterpolator\"},{\"tag\":\"KEYWORD2\",\"text\":\"TouchSensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"PlaneSensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"SphereSensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"CylinderSensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"ColorInterpolater\"},{\"tag\":\"KEYWORD2\",\"text\":\"ScalarInterpolator\"},{\"tag\":\"KEYWORD2\",\"text\":\"Switch\"},{\"tag\":\"KEYWORD2\",\"text\":\"Transform\"},{\"tag\":\"KEYWORD2\",\"text\":\"Billboard\"},{\"tag\":\"KEYWORD2\",\"text\":\"Inline\"},{\"tag\":\"KEYWORD2\",\"text\":\"Coordinate\"},{\"tag\":\"KEYWORD2\",\"text\":\"CoordinateInterpolator\"},{\"tag\":\"KEYWORD2\",\"text\":\"PointSet\"},{\"tag\":\"KEYWORD2\",\"text\":\"IndexedLineSet\"},{\"tag\":\"KEYWORD2\",\"text\":\"IndexedFaceSet\"},{\"tag\":\"KEYWORD2\",\"text\":\"ElevationGrid\"},{\"tag\":\"KEYWORD2\",\"text\":\"Extrusion\"},{\"tag\":\"KEYWORD2\",\"text\":\"Color\"},{\"tag\":\"KEYWORD2\",\"text\":\"PointSet\"},{\"tag\":\"KEYWORD2\",\"text\":\"ImageTexture\"},{\"tag\":\"KEYWORD2\",\"text\":\"PixelTexture\"},{\"tag\":\"KEYWORD2\",\"text\":\"MovieTexture\"},{\"tag\":\"KEYWORD2\",\"text\":\"TextureCoordinate\"},{\"tag\":\"KEYWORD2\",\"text\":\"TextureTransform\"},{\"tag\":\"KEYWORD2\",\"text\":\"Normal\"},{\"tag\":\"KEYWORD2\",\"text\":\"NormalInterpolator\"},{\"tag\":\"KEYWORD2\",\"text\":\"PointLight\"},{\"tag\":\"KEYWORD2\",\"text\":\"DirectionalLight\"},{\"tag\":\"KEYWORD2\",\"text\":\"SpotLight\"},{\"tag\":\"KEYWORD2\",\"text\":\"Background\"},{\"tag\":\"KEYWORD2\",\"text\":\"Fog\"},{\"tag\":\"KEYWORD2\",\"text\":\"AudioClip\"},{\"tag\":\"KEYWORD2\",\"text\":\"Sound\"},{\"tag\":\"KEYWORD2\",\"text\":\"LOD\"},{\"tag\":\"KEYWORD2\",\"text\":\"Viewpoint\"},{\"tag\":\"KEYWORD2\",\"text\":\"NavigationInfo\"},{\"tag\":\"KEYWORD2\",\"text\":\"VisibilitySensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"ProximitySensor\"},{\"tag\":\"KEYWORD2\",\"text\":\"Collision\"},{\"tag\":\"KEYWORD2\",\"text\":\"Anchor\"},{\"tag\":\"KEYWORD2\",\"text\":\"WorldInfo\"},{\"tag\":\"KEYWORD2\",\"text\":\"Script\"},{\"tag\":\"KEYWORD3\",\"text\":\"DEF\"},{\"tag\":\"KEYWORD3\",\"text\":\"FALSE\"},{\"tag\":\"KEYWORD3\",\"text\":\"NULL\"},{\"tag\":\"KEYWORD3\",\"text\":\"ROUTE\"},{\"tag\":\"KEYWORD3\",\"text\":\"PROTO\"},{\"tag\":\"KEYWORD3\",\"text\":\"EXTERNPROTO\"},{\"tag\":\"KEYWORD3\",\"text\":\"IS\"},{\"tag\":\"KEYWORD3\",\"text\":\"TO\"},{\"tag\":\"KEYWORD3\",\"text\":\"TRUE\"},{\"tag\":\"KEYWORD3\",\"text\":\"USE\"},{\"tag\":\"KEYWORD3\",\"text\":\"eventIn\"},{\"tag\":\"KEYWORD3\",\"text\":\"eventOut\"},{\"tag\":\"KEYWORD3\",\"text\":\"exposedField\"},{\"tag\":\"KEYWORD3\",\"text\":\"field\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFBool\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFColor\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFColor\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFFloat\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFFloat\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFImage\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFInt32\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFInt32\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFNode\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFnode\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFRotation\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFRotation\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFString\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFString\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFTime\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFVec2f\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFVec2f\"},{\"tag\":\"KEYWORD4\",\"text\":\"SFVec3f\"},{\"tag\":\"KEYWORD4\",\"text\":\"MFVec3f\"},{\"tag\":\"FUNCTION\",\"text\":\"assert\"},{\"tag\":\"LITERAL2\",\"text\":\"false\"},{\"tag\":\"INVALID\",\"text\":\"goto\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
