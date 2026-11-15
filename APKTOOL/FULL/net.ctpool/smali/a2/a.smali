.class public interface abstract La2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/a$a;
    }
.end annotation


# static fields
.field public static final a:La2/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La2/a$a;->a:La2/a$a;

    .line 2
    .line 3
    sput-object v0, La2/a;->a:La2/a$a;

    .line 4
    .line 5
    return-void
.end method

.method public static a(I)F
    .locals 1

    .line 1
    sget-object v0, La2/a;->a:La2/a$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La2/a$a;->b(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static b(I)F
    .locals 1

    .line 1
    sget-object v0, La2/a;->a:La2/a$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La2/a$a;->a(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static c(FF)Lcom/facebook/yoga/p;
    .locals 1

    .line 1
    sget-object v0, La2/a;->a:La2/a$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, La2/a$a;->c(FF)Lcom/facebook/yoga/p;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static d(FF)F
    .locals 1

    .line 1
    sget-object v0, La2/a;->a:La2/a$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, La2/a$a;->d(FF)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
