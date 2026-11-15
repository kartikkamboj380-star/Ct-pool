.class public final Lcom/facebook/react/fabric/mounting/mountitems/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/fabric/mounting/mountitems/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/f;

    invoke-direct {v0}, Lcom/facebook/react/fabric/mounting/mountitems/f;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/f;->a:Lcom/facebook/react/fabric/mounting/mountitems/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(IIILcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/c;-><init>(IIILcom/facebook/react/bridge/ReadableArray;)V

    return-object v0
.end method

.method public static final b(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/fabric/mounting/mountitems/b;
    .locals 1

    .line 1
    const-string v0, "commandId"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/d;-><init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-object v0
.end method

.method public static final c(I[I[Ljava/lang/Object;I)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    .line 1
    const-string v0, "intBuf"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objBuf"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;-><init>(I[I[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final d(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 9

    .line 1
    const-string v0, "component"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/g;

    move-object v1, v0

    move v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/fabric/mounting/mountitems/g;-><init>(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/uimanager/d0;Lcom/facebook/react/fabric/events/EventEmitterWrapper;Z)V

    return-object v0
.end method

.method public static final e(III)Lcom/facebook/react/fabric/mounting/mountitems/MountItem;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/fabric/mounting/mountitems/h;-><init>(III)V

    return-object v0
.end method
