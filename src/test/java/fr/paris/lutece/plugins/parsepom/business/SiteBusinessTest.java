/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */

package fr.paris.lutece.plugins.parsepom.business;

import fr.paris.lutece.test.LuteceTestCase;

public class SiteBusinessTest extends LuteceTestCase
{
    private final static String ARTIFACTID1 = "ArtifactId1";
    private final static String ARTIFACTID2 = "ArtifactId2";
    private final static String NAME1 = "Name1";
    private final static String NAME2 = "Name2";
    private final static String VERSION1 = "Version1";
    private final static String VERSION2 = "Version2";
    private final static String IDPLUGINS1 = "IdPLugins1";
    private final static String IDPLUGINS2 = "IdPLugins2";
    private final static String LASTUPDATE1 = "LastUpdate1";
    private final static String LASTUPDATE2 = "LastUpdate2";
    private final static String PATH1 = "Path1";
    private final static String PATH2 = "Path2";

    public void testBusiness( )
    {
        // Initialize an object
        Site site = new Site( );
        site.setArtifactId( ARTIFACTID1 );
        site.setName( NAME1 );
        site.setVersion( VERSION1 );
        site.setIdPlugins( IDPLUGINS1 );
        site.setLastUpdate( LASTUPDATE1 );
        site.setPath( PATH1 );

        // Create test
        SiteHome.create( site );
        Site siteStored = SiteHome.findByPrimaryKey( site.getId( ) );
        assertEquals( siteStored.getArtifactId( ), site.getArtifactId( ) );
        assertEquals( siteStored.getName( ), site.getName( ) );
        assertEquals( siteStored.getVersion( ), site.getVersion( ) );
        assertEquals( siteStored.getIdPlugins( ), site.getIdPlugins( ) );
        assertEquals( siteStored.getLastUpdate( ), site.getLastUpdate( ) );
        assertEquals( siteStored.getPath( ), site.getPath( ) );

        // Update test
        site.setArtifactId( ARTIFACTID2 );
        site.setName( NAME2 );
        site.setVersion( VERSION2 );
        site.setIdPlugins( IDPLUGINS2 );
        site.setLastUpdate( LASTUPDATE2 );
        site.setPath( PATH2 );
        SiteHome.update( site );
        siteStored = SiteHome.findByPrimaryKey( site.getId( ) );
        assertEquals( siteStored.getArtifactId( ), site.getArtifactId( ) );
        assertEquals( siteStored.getName( ), site.getName( ) );
        assertEquals( siteStored.getVersion( ), site.getVersion( ) );
        assertEquals( siteStored.getIdPlugins( ), site.getIdPlugins( ) );
        assertEquals( siteStored.getLastUpdate( ), site.getLastUpdate( ) );
        assertEquals( siteStored.getPath( ), site.getPath( ) );

        // List test
        SiteHome.getSitesList( );

        // Delete test
        SiteHome.remove( site.getId( ) );
        siteStored = SiteHome.findByPrimaryKey( site.getId( ) );
        assertNull( siteStored );

    }

}
