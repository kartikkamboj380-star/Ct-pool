.class public final Lcom/facebook/react/devsupport/InspectorFlags;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/devsupport/InspectorFlags;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/InspectorFlags;

    invoke-direct {v0}, Lcom/facebook/react/devsupport/InspectorFlags;-><init>()V

    sput-object v0, Lcom/facebook/react/devsupport/InspectorFlags;->a:Lcom/facebook/react/devsupport/InspectorFlags;

    invoke-static {}, Lcom/facebook/react/devsupport/G;->a()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native getFuseboxEnabled()Z
    .annotation build LR1/a;
    .end annotation
.end method
