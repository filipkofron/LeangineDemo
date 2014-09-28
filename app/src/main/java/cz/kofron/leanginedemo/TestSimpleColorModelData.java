package cz.kofron.leanginedemo;

import cz.kofron.leangine.buffer.ColorBuffer;
import cz.kofron.leangine.buffer.NormalBuffer;
import cz.kofron.leangine.buffer.VertexBuffer;
import cz.kofron.leangine.model.data.SimpleColorModelData;

/**
 * Created by kofee on 28.9.2014.
 */
public class TestSimpleColorModelData extends SimpleColorModelData
{
	public static float [] quadNormals = {
			// face a
			0.0f, 0.0f, 1.0f,
			0.0f, 0.0f, 1.0f,
			0.0f, 0.0f, 1.0f,

			// face b
			0.0f, 0.0f, 1.0f,
			0.0f, 0.0f, 1.0f,
			0.0f, 0.0f, 1.0f,
	};

	public static float [] quadVertices = {
			// face a
			-0.3f, -0.3f, 0.0f,
			0.3f, -0.3f, 0.0f,
			-0.3f, 0.3f, 0.0f,

			// face b
			0.3f, -0.3f, 0.0f,
			0.3f, 0.3f, 0.0f,
			-0.3f, 0.3f, 0.0f,
	};

	public static float [] quadColors = {
			// face a
			1.0f, 0.0f, 0.0f, 1.0f,
			0.0f, 1.0f, 0.0f, 1.0f,
			0.0f, 0.0f, 1.0f, 1.0f,

			// face b
			0.0f, 1.0f, 0.0f, 1.0f,
			1.0f, 0.0f, 1.0f, 1.0f,
			0.0f, 0.0f, 1.0f, 1.0f,
	};

	public TestSimpleColorModelData()
	{
		super(new VertexBuffer(quadVertices),
				new NormalBuffer(quadNormals),
				new ColorBuffer(quadColors));
	}
}
