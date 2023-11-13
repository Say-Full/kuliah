#ifdef __APPLE__
#include <OpenGL/OpenGL.h>
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif

void display()
{
	glTranslatef(0.5f, 1.0f, 0.0f);

	glBegin(GL_QUADS);
	glColor3f(1.0f, 0.0f, 0.0f);
	glVertex2f(-0.8f, 0.1f);
	glVertex2f(-0.2f, 0.1f);
	glVertex2f(-0.2f, 0.7f);
	glVertex2f(-0.8f, 0.7f);
	glEnd();

	glFlush();
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutCreateWindow("Muhammad Saifullah Sani");
	glutInitWindowSize(320, 320);
	glutInitWindowPosition(50, 50);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}