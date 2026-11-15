.class public final Lcom/facebook/react/fabric/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/fabric/d;

.field private static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/fabric/d;

    invoke-direct {v0}, Lcom/facebook/react/fabric/d;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/d;->a:Lcom/facebook/react/fabric/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/fabric/d;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "FabricSoLoader.staticInit::load:fabricjni"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_SO_FILE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    const-string v0, "fabricjni"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->LOAD_REACT_NATIVE_SO_FILE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-static {v1, v2}, LP2/a;->g(J)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/react/fabric/d;->b:Z

    return-void
.end method
