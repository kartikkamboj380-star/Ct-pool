.class public final Ld2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/a$a;
    }
.end annotation


# static fields
.field public static final a:Ld2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld2/a;->a:Ld2/a;

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

.method public static final b()Ld2/a;
    .locals 1

    .line 1
    sget-object v0, Ld2/a;->a:Ld2/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()Ld2/b$a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld2/a$a;

    .line 5
    .line 6
    invoke-direct {v0}, Ld2/a$a;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
