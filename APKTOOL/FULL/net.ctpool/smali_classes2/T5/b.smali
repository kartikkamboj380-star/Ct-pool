.class public interface abstract LT5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT5/b$a;
    }
.end annotation


# static fields
.field public static final a:LT5/b;

.field public static final b:LT5/b;

.field public static final c:LT5/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LT5/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT5/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT5/b;->c:LT5/b$a;

    .line 8
    .line 9
    new-instance v0, LT5/b$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, LT5/b$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LT5/b;->a:LT5/b;

    .line 15
    .line 16
    new-instance v0, LV5/b;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, v1, v2, v1}, LV5/b;-><init>(LT5/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LT5/b;->b:LT5/b;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(LT5/F;LT5/D;)LT5/B;
.end method
