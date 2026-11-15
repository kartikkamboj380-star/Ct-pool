.class public final LU1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU1/a;

.field private static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU1/a;

    .line 2
    .line 3
    invoke-direct {v0}, LU1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU1/a;->a:LU1/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()V
    .locals 3

    .line 1
    sget-boolean v0, LU1/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, LU1/a;->b:Z

    .line 8
    .line 9
    const-string v0, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni"

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "mapbufferjni"

    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, LP2/a;->g(J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
