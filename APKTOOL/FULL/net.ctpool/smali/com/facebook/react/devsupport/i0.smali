.class public final Lcom/facebook/react/devsupport/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/devsupport/i0;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/devsupport/i0;

    invoke-direct {v0}, Lcom/facebook/react/devsupport/i0;-><init>()V

    sput-object v0, Lcom/facebook/react/devsupport/i0;->a:Lcom/facebook/react/devsupport/i0;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const/16 v0, 0x7d6

    goto :goto_0

    :cond_0
    const/16 v0, 0x7f6

    :goto_0
    sput v0, Lcom/facebook/react/devsupport/i0;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
