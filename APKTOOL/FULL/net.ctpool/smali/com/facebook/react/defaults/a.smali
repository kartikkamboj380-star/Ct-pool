.class public final Lcom/facebook/react/defaults/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/defaults/a;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/defaults/a;

    invoke-direct {v0}, Lcom/facebook/react/defaults/a;-><init>()V

    sput-object v0, Lcom/facebook/react/defaults/a;->a:Lcom/facebook/react/defaults/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/defaults/a;->b:Z

    return v0
.end method
