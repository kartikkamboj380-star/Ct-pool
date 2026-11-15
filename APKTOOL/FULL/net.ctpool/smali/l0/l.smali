.class public interface abstract Ll0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/l$b;
    }
.end annotation


# static fields
.field public static final a:Ll0/l$b$c;

.field public static final b:Ll0/l$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll0/l$b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll0/l$b$c;-><init>(Ll0/l$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll0/l;->a:Ll0/l$b$c;

    .line 8
    .line 9
    new-instance v0, Ll0/l$b$b;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ll0/l$b$b;-><init>(Ll0/l$a;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ll0/l;->b:Ll0/l$b$b;

    .line 15
    .line 16
    return-void
.end method
