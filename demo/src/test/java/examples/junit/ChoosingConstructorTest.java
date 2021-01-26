package examples.junit;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.InputStream;
import java.io.OutputStream;


/**
 * Parasoft Jtest UTA: Test class for ChoosingConstructor
 *
 * @author matpierz
 * @see ChoosingConstructor
 */
public class ChoosingConstructorTest {
    // Parasoft Jtest UTA: Object under test
    @InjectMocks
    ChoosingConstructor underTest;

    // Parasoft Jtest UTA: Dependency generated for field _outStream in ChoosingConstructor
    @Mock
    OutputStream _outStream;

    // Parasoft Jtest UTA: Dependency generated for field _readable in ChoosingConstructor
    @Mock
    Readable _readable;

    // Parasoft Jtest UTA: Dependency generated for field _inStream in ChoosingConstructor
    @Mock
    InputStream _inStream;

    // Parasoft Jtest UTA: Initialize object under test with mocked dependencies
    @Before
    public void setupMocks() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Parasoft Jtest UTA: Test for performAction()
     *
     * @author matpierz
     * @see ChoosingConstructor#performAction()
     */
    @Test
    public void testPerformAction() throws Throwable {
        // UTA: One or more of the required values have not been automatically set.
        // Review the information about the required modifications below and manually update the missing value(s).
        //
        // To cover the code, make the following modifications:
        //  - the 'this._readable' variable cannot be set to 'null'
        //  - the 'this._inStream' variable cannot be set to 'null'
        //  - the 'this._outStream' variable cannot be set to 'null'

        // When
        underTest.performAction();

    }

    /**
     * Parasoft Jtest UTA: Test for performAction()
     *
     * @author matpierz
     * @see ChoosingConstructor#performAction()
     */
    @Test
    public void testPerformAction2() throws Throwable {
        // UTA: One or more of the required values have not been automatically set.
        // Review the information about the required modifications below and manually update the missing value(s).
        //
        // To cover the code, make the following modifications:
        //  - the 'this._readable' variable cannot be set to 'null'
        //  - the 'this._inStream' variable cannot be set to 'null'
        //  - the 'this._outStream' variable cannot be set to 'null'

        // When
        underTest.performAction();

    }

    /**
     * Parasoft Jtest UTA: Test for performAction()
     *
     * @author matpierz
     * @see ChoosingConstructor#performAction()
     */
    @Test
    public void testPerformAction3() throws Throwable {
        // UTA: One or more of the required values have not been automatically set.
        // Review the information about the required modifications below and manually update the missing value(s).
        //
        // To cover the code, make the following modifications:
        //  - the 'this._readable' variable cannot be set to 'null'
        //  - the 'this._inStream' variable cannot be set to 'null'
        //  - the 'this._outStream' variable cannot be set to 'null'

        // When
        underTest.performAction();

    }

    /**
     * Parasoft Jtest UTA: Test for performAction()
     *
     * @author matpierz
     * @see ChoosingConstructor#performAction()
     */
    @Test
    public void testPerformAction4() throws Throwable {
        // UTA: One or more of the required values have not been automatically set.
        // Review the information about the required modifications below and manually update the missing value(s).
        //
        // To cover the code, make the following modifications:
        //  - the 'this._readable' variable cannot be set to 'null'
        //  - the 'this._inStream' variable cannot be set to 'null'
        //  - the 'this._outStream' variable cannot be set to 'null'

        // When
        underTest.performAction();

    }

    /**
     * Parasoft Jtest UTA: Test for read()
     *
     * @author matpierz
     * @see ChoosingConstructor#read()
     */
    @Test
    public void testRead() throws Throwable {
        // When
        underTest.read();

    }
}